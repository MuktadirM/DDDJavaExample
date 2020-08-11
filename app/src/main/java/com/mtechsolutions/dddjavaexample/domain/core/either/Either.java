package com.mtechsolutions.dddjavaexample.domain.core.either;


public class Either<L,R> {
    private final Optional<L> left;
    private final Optional<R> right;

    private Either(Optional<L> l, Optional<R> r) {
        left=l;
        right=r;
    }

    public static <L,R> Either<L,R> left(L value){
            return new Either<>(Optional.of(value),Optional.<R>empty());
    }

    public static <L,R> Either<L,R> right(R value){
        return new Either<>(Optional.<L>empty(),Optional.of(value));
    }

    public Optional<L> getLeft(){
        return left;
    }

    public Optional<R> getRight(){
        return right;
    }

    public boolean isRight(){
        return this.right != null;
    }

    public boolean isLeft(){
        return this.left != null;
    }


}
