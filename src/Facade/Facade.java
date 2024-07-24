package Facade;

import java.util.ArrayList;
import java.util.List;

public class Facade {
    private List<Subsystem> subsystems;

    public Facade() {
        subsystems = new ArrayList<>();
        subsystems.add(new WebSubsystem());
        subsystems.add(new MobileSubsystem());
        subsystems.add(new PhoneSubsystem());
    }

    public void subsystemOperation() {
        for (Subsystem subsystem : subsystems) {
            subsystem.operation();
        }
    }
}