package com.kodilla.patterns.builder.bigmac;

public final class Roll {
    public static final String SESAME = "SESAME";
    public static final String NO_SESAME = "NO_SESAME";
    final private String kind;

    public Roll(final String kind) {
        if (kind.equals(SESAME) || kind.equals(NO_SESAME)) {
            this.kind = kind;
        } else {
            throw new IllegalStateException("Roll should be SESAME or NO_SESAME");
        }
    }

    public String getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return "Roll{" +
                "kind='" + kind + '\'' +
                '}';
    }
}
