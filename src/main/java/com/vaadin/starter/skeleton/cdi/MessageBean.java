package com.vaadin.starter.skeleton.cdi;

import com.vaadin.cdi.annotation.NormalUIScoped;

/**
 * Data provider bean.
 */
@NormalUIScoped
public class MessageBean {

    /**
     * Gets message data.
     *
     * @return a message
     */
    public String getMessage() {
        return "Not Clicked";
    }
}
