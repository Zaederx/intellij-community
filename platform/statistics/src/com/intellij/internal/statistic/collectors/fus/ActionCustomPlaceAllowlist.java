// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package com.intellij.internal.statistic.collectors.fus;

import com.intellij.openapi.extensions.AbstractExtensionPointBean;
import com.intellij.openapi.extensions.ExtensionPointName;
import com.intellij.util.xmlb.annotations.Attribute;

/**
 * Extension point to register custom action places.
 *
 * There's no need to register this EP if action place is listed in {@link com.intellij.openapi.actionSystem.ActionPlaces#isCommonPlace(String)}
 */
public class ActionCustomPlaceAllowlist extends AbstractExtensionPointBean {
  public static final ExtensionPointName<ActionCustomPlaceAllowlist> EP_NAME = ExtensionPointName.create("com.intellij.statistics.actionCustomPlaceAllowlist");

  /**
   * Semicolon-separated list of custom places for actions
   */
  @Attribute("places")
  public String places;
}
