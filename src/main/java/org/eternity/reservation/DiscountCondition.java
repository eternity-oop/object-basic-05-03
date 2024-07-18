package org.eternity.reservation;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
