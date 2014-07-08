package org.example.jsfpostback;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 */
@RequestScoped
@Named
public class Bean {

    public String toB() {
        return "B";
    }
}
