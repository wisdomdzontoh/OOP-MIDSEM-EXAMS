import java.util.ArrayList;
import java.util.List;

public class Report {
    private String reportID;
    private String reportType;
    private String dateRange;
    private List<SalesTransaction> data;

    public Report(String reportID, String reportType, String dateRange) {
        this.reportID = reportID;
        this.reportType = reportType;
        this.dateRange = dateRange;
        this.data = new ArrayList<>();
    }

    public void generateReport() {
        // Implementation here
    }

    public void exportReport() {
        // Implementation here
    }

    public void displayReport() {
        // Implementation here
    }
}
