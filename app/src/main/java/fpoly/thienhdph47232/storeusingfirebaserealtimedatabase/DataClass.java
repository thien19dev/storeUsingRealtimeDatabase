package fpoly.thienhdph47232.storeusingfirebaserealtimedatabase;

public class DataClass {
    private String dataTitle, dataDescription, dataLanguage, dataImage;

    public DataClass(String dataTitle, String dataDescription, String dataLanguage, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataDescription = dataDescription;
        this.dataLanguage = dataLanguage;
        this.dataImage = dataImage;
    }

    public DataClass(){

    }

    public String getDataTitle() {
        return dataTitle;
    }

    public void setDataTitle(String dataTitle) {
        this.dataTitle = dataTitle;
    }

    public String getDataDescription() {
        return dataDescription;
    }

    public void setDataDescription(String dataDescription) {
        this.dataDescription = dataDescription;
    }

    public String getDataLanguage() {
        return dataLanguage;
    }

    public void setDataLanguage(String dataLanguage) {
        this.dataLanguage = dataLanguage;
    }

    public String getDataImage() {
        return dataImage;
    }

    public void setDataImage(String dataImage) {
        this.dataImage = dataImage;
    }
}
