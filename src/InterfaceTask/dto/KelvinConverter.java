package InterfaceTask.dto;

import InterfaceTask.util.BaseConverter;

public class KelvinConverter extends BaseConverter {

    public KelvinConverter() {
        super(" Kelvin");
    }

    @Override
    public double convertFromCelsius(double value) {
        return value + 273.15;
    }

}
