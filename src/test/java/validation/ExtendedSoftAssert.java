package validation;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.testng.asserts.IAssert;
import org.testng.asserts.SoftAssert;
import org.testng.collections.Maps;

import java.util.Map;

public class ExtendedSoftAssert extends SoftAssert {
    // LinkedHashMap to preserve the order
    private StringBuilder assertionResults = new StringBuilder();
    private final Map<AssertionError, IAssert<?>> m_errors = Maps.newLinkedHashMap();
    private String assertMessage = null;


    @Override
    protected void doAssert(IAssert<?> a) {
        onBeforeAssert(a);
        try {
            assertMessage = a.getMessage();
            a.doAssert();
            onAssertSuccess(a);
            assertionResults.append(a.getExpected().toString() + "," + a.getActual().toString() + ",OK\n" + ",");
        } catch (AssertionError ex) {
            onAssertFailure(a, ex);
            m_errors.put(ex, a);
            assertionResults.append(a.getExpected().toString() + "," + a.getActual().toString() + ",FAIL\n" + ",");
        } finally {
            onAfterAssert(a);
        }
    }

    @Step("Response validation result ")
    public void assertAll() {
        getHtmlTable(assertionResults.toString());
        if (!m_errors.isEmpty()) {
            StringBuilder sb = new StringBuilder("The following asserts failed:");
            boolean first = true;
            for (Map.Entry<AssertionError, IAssert<?>> ae : m_errors.entrySet()) {
                if (first) {
                    first = false;
                } else {
                    sb.append(",");
                }
                sb.append("\n\t");
                sb.append(ae.getKey().getMessage());
            }
            throw new AssertionError(sb.toString());
        }
    }

    @Attachment(value = "HTML attachment", type = "text/html")
    public String getHtmlTable(String assertMessage) {
        StringBuilder addNewColumn = new StringBuilder();
        String[] validationResults = assertMessage.split(",");
        int i = 1;
        int j = 2;
        for (String s : validationResults
        ) {
            if (validationResults[j].equals("OK\n")) {
                addNewColumn.append("<td style=\"font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#669;background-color:#32cb00;font-weight:bold;text-align:center;vertical-align:top\">" + s + "</td>");
            } else {
                addNewColumn.append("<td style=\"font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#669;background-color:#cb0000;font-weight:bold;text-align:center;vertical-align:top\">" + s + "</td>");
            }
            if (i % 3 == 0) {
                j = j + 3;
                addNewColumn.append("</tr>");
                addNewColumn.append("<tr>");
            }
            i++;
        }
        String baseCode = "<!DOCTYPE html><html><head><title>Page Title</title></head><body><table style=\"border-collapse:collapse;border-spacing:0;border-color:#aabcfe\" class=\"tg\"><tr><th style=\"font-family:Arial, sans-serif;font-size:14px;font-weight:bold;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#039;background-color:#b9c9fe;text-align:center;vertical-align:top\" colspan=\"3\">Validation results</th></tr><tr><td style=\"font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#669;background-color:#D2E4FC;font-weight:bold;text-align:center;vertical-align:top\">expected</td><td style=\"font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#669;background-color:#D2E4FC;font-weight:bold;text-align:center;vertical-align:top\">actual</td><td style=\"font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#669;background-color:#D2E4FC;font-weight:bold;text-align:center;vertical-align:top\">result</td></tr><tr>" + addNewColumn.toString() + "</tr></table></body></html>";
        return baseCode;
    }
}
