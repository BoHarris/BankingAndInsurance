package com.solvd.bankingandinsurance.interfaces.lambda;

@FunctionalInterface
public interface Consumer<T> {

	void accept(T t);

}
