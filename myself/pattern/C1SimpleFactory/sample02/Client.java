package pattern.C1SimpleFactory.sample02;

public class Client {
    public static void main(String[] args) {
        Chart chart;
        String chartType = pattern.C1SimpleFactory.sample02.XMLUtil.getChartType();
        chart = pattern.C1SimpleFactory.sample02.ChartFactory.getChart(chartType);
        chart.display();
    }
}
