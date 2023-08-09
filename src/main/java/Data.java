import static java.lang.String.format;

public class Data {
//    Instance variables amount, unit, and downloadSpeed
    private double amount;
    private String unit;
    private double downloadSpeed;

    private double megabytes;


    //    Constructor
    Data(double amount, String unit, double downloadSpeed) {
        this.amount = amount;
        this.unit = unit;
        this.downloadSpeed = downloadSpeed;
    }

//    Class methods
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setDownloadSpeed(double downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }


    public double convertToMegabytes() {

        switch (unit) {
            case "bytes" -> megabytes = (amount / 1024) / 1024;
            case "kilobytes" -> megabytes = amount / 1024;
            case "megabytes" -> megabytes = amount * 1;
            case "gigabytes" -> megabytes = amount * 1024;
            default -> throw new IllegalArgumentException();
        }
            return megabytes;


    }
    public double calculateDownloadTime() {
        double megabytes = convertToMegabytes();
        double downloadTime = megabytes / (downloadSpeed / 8);

        return downloadTime;
    }

    public String getFormattedDownloadTime() {
        double downloadTime = calculateDownloadTime();

        double timeDecimal = downloadTime / 60;
        double minutes = timeDecimal;
        double seconds = downloadTime % 60;

        String stringMinutes = String.format("%.0f", minutes);
        String stringSeconds = String.format("%.0f", seconds);

        String formattedDownloadTime = stringMinutes + " minutes " + stringSeconds + " seconds";

        return formattedDownloadTime;
    }

//    toString using Class methods
    public String toString() {
        String formattedDownloadTime = getFormattedDownloadTime();
        String megaByteCount = "Data: " + amount + " " + unit + "\n";
        return megaByteCount +
                "Download Time: " + formattedDownloadTime;
    }
}
