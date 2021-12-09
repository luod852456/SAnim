package com.luodong.sanim;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;

/**
 * 动画
 */
public class SAnim {

    private static String getAlpha() {
        return "alpha";
    }

    private static String getRotation() {
        return "rotation";
    }

    private static String getScaleX() {
        return "scaleX";
    }

    private static String getScaleY() {
        return "scaleY";
    }

    private static String getTranslationY() {
        return "translationY";
    }

    private static String getTranslationX() {
        return "translationX";
    }

    /**
     * 创建ObjectAnimator
     *
     * @param target
     * @param propertyName
     * @param values
     * @return
     */
    public static ObjectAnimator getObjectAnimator(Object target, String propertyName, float... values) {
        return ObjectAnimator.ofFloat(target, propertyName, values);
    }

    /**
     * 创建AnimatorSet
     *
     * @return
     */
    public static AnimatorSet getAnimatorSet() {
        return new AnimatorSet();
    }

    /**
     * 透明度动画
     *
     * @param target
     * @param values 0-1
     * @return
     */
    public static ObjectAnimator alpha(Object target, float... values) {
        return getObjectAnimator(target, getAlpha(), values);
    }

    /**
     * 旋转动画
     *
     * @param target
     * @param values 0-360
     * @return
     */
    public static ObjectAnimator rotation(Object target, float... values) {
        return getObjectAnimator(target, getRotation(), values);
    }

    /**
     * 缩放x动画
     *
     * @param target
     * @param values 0-1
     * @return
     */
    public static ObjectAnimator scaleX(Object target, float... values) {
        return getObjectAnimator(target, getScaleX(), values);
    }

    /**
     * 缩放y动画
     *
     * @param target
     * @param values 0-1
     * @return
     */
    public static ObjectAnimator scaleY(Object target, float... values) {
        return getObjectAnimator(target, getScaleY(), values);
    }

    /**
     * 缩放动画
     *
     * @param target
     * @param values 0-1
     * @return
     */
    public static AnimatorSet scale(Object target, float... values) {
        AnimatorSet animatorSet = getAnimatorSet();
        animatorSet.playTogether(
                scaleX(target, values),
                scaleY(target, values));
        return animatorSet;
    }


    /**
     * 平移动画
     *
     * @param target
     * @param valuesX
     * @param valuesY
     * @return
     */
    public static AnimatorSet translation(Object target, float valuesX, float valuesY) {
        AnimatorSet animatorSet = getAnimatorSet();
        animatorSet.playTogether(
                translationX(target, valuesX),
                translationY(target, valuesY));
        return animatorSet;
    }

    /**
     * 平移x动画
     *
     * @param target
     * @param values
     * @return
     */
    public static ObjectAnimator translationX(Object target, float... values) {
        return getObjectAnimator(target, getTranslationX(), values);
    }

    /**
     * 平移y动画
     *
     * @param target
     * @param values
     * @return
     */
    public static ObjectAnimator translationY(Object target, float... values) {
        return getObjectAnimator(target, getTranslationY(), values);
    }
}