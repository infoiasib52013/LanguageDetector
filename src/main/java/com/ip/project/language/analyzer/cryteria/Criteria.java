package com.ip.project.language.analyzer.cryteria;

/**
 * Created by .
 */
public abstract class Criteria {

    String value;

    abstract String setCorrectValue(String correctValue);

    abstract String verifyCriteriaValueMatchesValue(String value);
}
