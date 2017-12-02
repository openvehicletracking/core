package com.openvehicletracking.core.message.impl;

import com.openvehicletracking.core.GsonFactory;
import com.openvehicletracking.core.message.CommandMessage;

/**
 * Created by yo on 03/10/2017.
 */
public class StringCommandMessage extends AbstractCommandMessage {

    @Override
    public String asJsonString() {
        return GsonFactory.getGson().toJson(this);
    }
}
