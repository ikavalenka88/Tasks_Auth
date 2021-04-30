package InterfaceTask.dto;

import InterfaceTask.util.BaseConverter;

public class ReaumurConverter extends BaseConverter {
    public ReaumurConverter() {
        super(" Reaumur");
    }

    @Override
    public double convertFromCelsius(double value) {
        return value + 218.52;
    }
}
