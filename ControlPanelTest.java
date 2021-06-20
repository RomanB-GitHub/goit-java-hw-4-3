class ControlPanelTest {
    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        System.out.println(new Altimeter());
        System.out.println(new AirGauge());
    }
}

class Altimeter {
    @Override

    public String toString(){

        return "Measure height";
    }
}

class AirGauge {

    @Override
    public String toString() {
        return "Measure air pressure";
    }
}
class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();

    public void control(){
        altimeter.toString();
        airGauge.toString();
    }
}

