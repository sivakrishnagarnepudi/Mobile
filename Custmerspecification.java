public class Custmerspecification extends Mobile{

    @Override
    public void mobileColor(String color) {
        System.out.println("mobilecolor:"+color);

    }

    @Override
    public void mobileEdition(String edition) {
        System.out.println("Newedition:"+edition);

    }

    @Override
    public void hardware(String processor) {
        System.out.println("software:"+processor);

    }

    @Override
    public void sim(String company) {
        System.out.println("simcompany:"+company);
    }
}
