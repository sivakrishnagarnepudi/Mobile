public class Camera {
    int noofCamers;

    String rearCamera;
    String frontCamera;



    public Camera(String frontCamera, int noofCamers, String rearCamera) {
        this.frontCamera = frontCamera;
        this.noofCamers=noofCamers;
        this.rearCamera=rearCamera;
    }
    public String getFrontCamera() {
        return frontCamera;
    }


    public int getNoofCamers() {
        return noofCamers;
    }

    public String getRearCamera() {
        return rearCamera;
    }



}
