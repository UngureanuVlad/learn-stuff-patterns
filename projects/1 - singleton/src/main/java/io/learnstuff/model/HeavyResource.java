package io.learnstuff.model;

import lombok.Data;

@Data
public class HeavyResource {

    private String resourcePart = "Heavy resource processing!";

    public void heavyOperation() {
        System.out.println(this.resourcePart);
    }

}
