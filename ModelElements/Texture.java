package Architecture_HW_01.ModelElements;

public class Texture {

    private String url;
    private Double transparency; 

    public Texture() {
    }

    public Texture(String url, Double transparency) {
        this.url = url;
        this.transparency = transparency;
    }

    public void loadTexture(String url) {
        this.url = url;
    }

    public void setTransparency(Double transparency) {
        this.transparency = transparency;
    }

    public Double getTransparency() {
        return this.transparency;
    }

    // ToDo
    public String getTexture() {
        return this.url;
    }

}