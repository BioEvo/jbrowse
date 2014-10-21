package org.bbop.apollo

/**
 * Note: top-level in the sequence ontology
 */
class Minus2Frameshift extends Frameshift{

    static constraints = {
    }

    String ontologyId = "SO:0000867"// XX:NNNNNNN
    String cvTerm = "Minus2Frameshift"

    // add convenience methods
    @Override
    boolean isPlusFrameshift() {
        return false
    }

    @Override
    int getFrameshiftValue() {
        return 2
    }
}
