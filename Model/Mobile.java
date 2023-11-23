public abstract class Mobile {
  public abstract void mobileColor(String color);
  public abstract void mobileEdition(String edition);
  public abstract void hardware(String processor);
  public abstract void sim(String company);
  public void getMobile(){
  Camera camera=getCamera();
  Display display=getDisplay();
  Standardapps apps= getStandardapps();
  System.out.println(camera.getFrontCamera());
    System.out.println(camera.getRearCamera());
    System.out.println(camera.getNoofCamers());
    System.out.println(display.getTypeofDisplay());
    System.out.println(apps.getGoogle());
    System.out.println(apps.getSettings());
    System.out.println(apps.getYoutube());
  }
  public Camera getCamera(){
    return new Camera("12MP",4,"64mp,12mp,4mp");
  }
  public Display getDisplay(){
    return new Display("Amoled display");
  }
  public Standardapps getStandardapps(){
    return new Standardapps("googlechrome,googlemaps,googledrive","youtube","mobilesettings");
  }

}
