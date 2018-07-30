/**
 * Copyright (c) 2014-present, Facebook, Inc.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

// @Generated by gentest/gentest.rb from gentest/fixtures/YGAndroidNewsFeed.html

package com.facebook.yoga;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class YGAndroidNewsFeed {
  @Parameterized.Parameters(name = "{0}")
  public static Iterable<TestParametrization.NodeFactory> nodeFactories() {
    return TestParametrization.nodeFactories();
  }

  @Parameterized.Parameter public TestParametrization.NodeFactory mNodeFactory;

  @Test
  public void test_android_news_feed() {
    YogaConfig config = new YogaConfig();

    final YogaNode root = createNode(config);
    root.setAlignContent(YogaAlign.STRETCH);
    root.setWidth(1080f);

    final YogaNode root_child0 = createNode(config);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child0_child0 = createNode(config);
    root_child0_child0.setAlignContent(YogaAlign.STRETCH);
    root_child0.addChildAt(root_child0_child0, 0);

    final YogaNode root_child0_child0_child0 = createNode(config);
    root_child0_child0_child0.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0.addChildAt(root_child0_child0_child0, 0);

    final YogaNode root_child0_child0_child0_child0 = createNode(config);
    root_child0_child0_child0_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0_child0_child0_child0.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child0_child0.setAlignItems(YogaAlign.FLEX_START);
    root_child0_child0_child0_child0.setMargin(YogaEdge.START, 36f);
    root_child0_child0_child0_child0.setMargin(YogaEdge.TOP, 24f);
    root_child0_child0_child0.addChildAt(root_child0_child0_child0_child0, 0);

    final YogaNode root_child0_child0_child0_child0_child0 = createNode(config);
    root_child0_child0_child0_child0_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0_child0_child0_child0_child0.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child0_child0.addChildAt(root_child0_child0_child0_child0_child0, 0);

    final YogaNode root_child0_child0_child0_child0_child0_child0 = createNode(config);
    root_child0_child0_child0_child0_child0_child0.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child0_child0_child0_child0.setWidth(120f);
    root_child0_child0_child0_child0_child0_child0.setHeight(120f);
    root_child0_child0_child0_child0_child0.addChildAt(
        root_child0_child0_child0_child0_child0_child0, 0);

    final YogaNode root_child0_child0_child0_child0_child1 = createNode(config);
    root_child0_child0_child0_child0_child1.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child0_child0_child1.setFlexShrink(1f);
    root_child0_child0_child0_child0_child1.setMargin(YogaEdge.RIGHT, 36f);
    root_child0_child0_child0_child0_child1.setPadding(YogaEdge.LEFT, 36);
    root_child0_child0_child0_child0_child1.setPadding(YogaEdge.TOP, 21);
    root_child0_child0_child0_child0_child1.setPadding(YogaEdge.RIGHT, 36);
    root_child0_child0_child0_child0_child1.setPadding(YogaEdge.BOTTOM, 18);
    root_child0_child0_child0_child0.addChildAt(root_child0_child0_child0_child0_child1, 1);

    final YogaNode root_child0_child0_child0_child0_child1_child0 = createNode(config);
    root_child0_child0_child0_child0_child1_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0_child0_child0_child0_child1_child0.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child0_child0_child1_child0.setFlexShrink(1f);
    root_child0_child0_child0_child0_child1.addChildAt(
        root_child0_child0_child0_child0_child1_child0, 0);

    final YogaNode root_child0_child0_child0_child0_child1_child1 = createNode(config);
    root_child0_child0_child0_child0_child1_child1.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child0_child0_child1_child1.setFlexShrink(1f);
    root_child0_child0_child0_child0_child1.addChildAt(
        root_child0_child0_child0_child0_child1_child1, 1);

    final YogaNode root_child0_child0_child1 = createNode(config);
    root_child0_child0_child1.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0.addChildAt(root_child0_child0_child1, 1);

    final YogaNode root_child0_child0_child1_child0 = createNode(config);
    root_child0_child0_child1_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0_child0_child1_child0.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child1_child0.setAlignItems(YogaAlign.FLEX_START);
    root_child0_child0_child1_child0.setMargin(YogaEdge.START, 174f);
    root_child0_child0_child1_child0.setMargin(YogaEdge.TOP, 24f);
    root_child0_child0_child1.addChildAt(root_child0_child0_child1_child0, 0);

    final YogaNode root_child0_child0_child1_child0_child0 = createNode(config);
    root_child0_child0_child1_child0_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0_child0_child1_child0_child0.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child1_child0.addChildAt(root_child0_child0_child1_child0_child0, 0);

    final YogaNode root_child0_child0_child1_child0_child0_child0 = createNode(config);
    root_child0_child0_child1_child0_child0_child0.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child1_child0_child0_child0.setWidth(72f);
    root_child0_child0_child1_child0_child0_child0.setHeight(72f);
    root_child0_child0_child1_child0_child0.addChildAt(
        root_child0_child0_child1_child0_child0_child0, 0);

    final YogaNode root_child0_child0_child1_child0_child1 = createNode(config);
    root_child0_child0_child1_child0_child1.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child1_child0_child1.setFlexShrink(1f);
    root_child0_child0_child1_child0_child1.setMargin(YogaEdge.RIGHT, 36f);
    root_child0_child0_child1_child0_child1.setPadding(YogaEdge.LEFT, 36);
    root_child0_child0_child1_child0_child1.setPadding(YogaEdge.TOP, 21);
    root_child0_child0_child1_child0_child1.setPadding(YogaEdge.RIGHT, 36);
    root_child0_child0_child1_child0_child1.setPadding(YogaEdge.BOTTOM, 18);
    root_child0_child0_child1_child0.addChildAt(root_child0_child0_child1_child0_child1, 1);

    final YogaNode root_child0_child0_child1_child0_child1_child0 = createNode(config);
    root_child0_child0_child1_child0_child1_child0.setFlexDirection(YogaFlexDirection.ROW);
    root_child0_child0_child1_child0_child1_child0.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child1_child0_child1_child0.setFlexShrink(1f);
    root_child0_child0_child1_child0_child1.addChildAt(
        root_child0_child0_child1_child0_child1_child0, 0);

    final YogaNode root_child0_child0_child1_child0_child1_child1 = createNode(config);
    root_child0_child0_child1_child0_child1_child1.setAlignContent(YogaAlign.STRETCH);
    root_child0_child0_child1_child0_child1_child1.setFlexShrink(1f);
    root_child0_child0_child1_child0_child1.addChildAt(
        root_child0_child0_child1_child0_child1_child1, 1);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(1080f, root.getLayoutWidth(), 0.0f);
    assertEquals(240f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(1080f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(240f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(1080f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(240f, root_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(1080f, root_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(144f, root_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child0_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(24f, root_child0_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(1044f, root_child0_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(120f, root_child0_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(120f, root_child0_child0_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(120f, root_child0_child0_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child0_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(120f, root_child0_child0_child0_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(120f, root_child0_child0_child0_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(120f, root_child0_child0_child0_child0_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child1.getLayoutY(), 0.0f);
    assertEquals(72f, root_child0_child0_child0_child0_child1.getLayoutWidth(), 0.0f);
    assertEquals(39f, root_child0_child0_child0_child0_child1.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child0_child0_child0_child0_child1_child0.getLayoutX(), 0.0f);
    assertEquals(21f, root_child0_child0_child0_child0_child1_child0.getLayoutY(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child1_child0.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child1_child0.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child0_child0_child0_child0_child1_child1.getLayoutX(), 0.0f);
    assertEquals(21f, root_child0_child0_child0_child0_child1_child1.getLayoutY(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child1_child1.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child1_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child1.getLayoutX(), 0.0f);
    assertEquals(144f, root_child0_child0_child1.getLayoutY(), 0.0f);
    assertEquals(1080f, root_child0_child0_child1.getLayoutWidth(), 0.0f);
    assertEquals(96f, root_child0_child0_child1.getLayoutHeight(), 0.0f);

    assertEquals(174f, root_child0_child0_child1_child0.getLayoutX(), 0.0f);
    assertEquals(24f, root_child0_child0_child1_child0.getLayoutY(), 0.0f);
    assertEquals(906f, root_child0_child0_child1_child0.getLayoutWidth(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child1_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child0.getLayoutY(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child1_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(72f, root_child0_child0_child1_child0_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child1.getLayoutY(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0_child1.getLayoutWidth(), 0.0f);
    assertEquals(39f, root_child0_child0_child1_child0_child1.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child0_child0_child1_child0_child1_child0.getLayoutX(), 0.0f);
    assertEquals(21f, root_child0_child0_child1_child0_child1_child0.getLayoutY(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child1_child0.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child1_child0.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child0_child0_child1_child0_child1_child1.getLayoutX(), 0.0f);
    assertEquals(21f, root_child0_child0_child1_child0_child1_child1.getLayoutY(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child1_child1.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child1_child1.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(1080f, root.getLayoutWidth(), 0.0f);
    assertEquals(240f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(1080f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(240f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(1080f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(240f, root_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(1080f, root_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(144f, root_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(24f, root_child0_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(1044f, root_child0_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(120f, root_child0_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(924f, root_child0_child0_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(120f, root_child0_child0_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(120f, root_child0_child0_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child0_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(120f, root_child0_child0_child0_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(120f, root_child0_child0_child0_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(816f, root_child0_child0_child0_child0_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child1.getLayoutY(), 0.0f);
    assertEquals(72f, root_child0_child0_child0_child0_child1.getLayoutWidth(), 0.0f);
    assertEquals(39f, root_child0_child0_child0_child0_child1.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child0_child0_child0_child0_child1_child0.getLayoutX(), 0.0f);
    assertEquals(21f, root_child0_child0_child0_child0_child1_child0.getLayoutY(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child1_child0.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child1_child0.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child0_child0_child0_child0_child1_child1.getLayoutX(), 0.0f);
    assertEquals(21f, root_child0_child0_child0_child0_child1_child1.getLayoutY(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child1_child1.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0_child0_child0_child0_child1_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child1.getLayoutX(), 0.0f);
    assertEquals(144f, root_child0_child0_child1.getLayoutY(), 0.0f);
    assertEquals(1080f, root_child0_child0_child1.getLayoutWidth(), 0.0f);
    assertEquals(96f, root_child0_child0_child1.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child1_child0.getLayoutX(), 0.0f);
    assertEquals(24f, root_child0_child0_child1_child0.getLayoutY(), 0.0f);
    assertEquals(906f, root_child0_child0_child1_child0.getLayoutWidth(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0.getLayoutHeight(), 0.0f);

    assertEquals(834f, root_child0_child0_child1_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child0.getLayoutY(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0_child1_child0_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child0_child0.getLayoutY(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0_child0_child0.getLayoutHeight(), 0.0f);

    assertEquals(726f, root_child0_child0_child1_child0_child1.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child1.getLayoutY(), 0.0f);
    assertEquals(72f, root_child0_child0_child1_child0_child1.getLayoutWidth(), 0.0f);
    assertEquals(39f, root_child0_child0_child1_child0_child1.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child0_child0_child1_child0_child1_child0.getLayoutX(), 0.0f);
    assertEquals(21f, root_child0_child0_child1_child0_child1_child0.getLayoutY(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child1_child0.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child1_child0.getLayoutHeight(), 0.0f);

    assertEquals(36f, root_child0_child0_child1_child0_child1_child1.getLayoutX(), 0.0f);
    assertEquals(21f, root_child0_child0_child1_child0_child1_child1.getLayoutY(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child1_child1.getLayoutWidth(), 0.0f);
    assertEquals(0f, root_child0_child0_child1_child0_child1_child1.getLayoutHeight(), 0.0f);
  }

  private YogaNode createNode(YogaConfig config) {
    return mNodeFactory.create(config);
  }
}
