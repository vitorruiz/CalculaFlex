package br.com.vitorruiz.calculaflex

fun Double.format(digits: Int) = java.lang.String.format("%.${digits}f", this)