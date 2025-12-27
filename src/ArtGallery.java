public class ArtGallery{
    private String name;
    private String location;

    public ArtGallery(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void AlterName(String name) {
        this.name = name;
    }

    public void AlterLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void getGalleryInfo(){
        System.out.println("ArtGallery: " + name + ", Location: " + location);
    }
}
