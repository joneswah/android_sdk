package com.adjust.sdk;

import java.util.Map;

/**
 * Created by pfms on 01/04/16.
 */
public interface SessionCallbackParametersUpdater {
    Map<String, String> updateSessionCallbackParameters(Map<String, String> currentSessionCallbackParameters);
}