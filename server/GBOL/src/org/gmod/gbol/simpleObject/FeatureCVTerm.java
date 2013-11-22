package org.gmod.gbol.simpleObject;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.FeatureCVTerm.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class FeatureCVTerm extends org.gmod.gbol.simpleObject.generated.AbstractFeatureCVTerm {

	private static final long serialVersionUID = 1L;

	public FeatureCVTerm(){
		super();
	}

//	@Override
//	public Collection<AbstractSimpleObject> getWriteObjects() {
//		ArrayList<AbstractSimpleObject> writeObjects = new ArrayList<AbstractSimpleObject>();
//		// Have to write yourself
//		writeObjects.add(this);
//		
//		// Singletons
//		writeObjects.addAll(this.getCvterm().getWriteObjects());
//		writeObjects.addAll(this.getPublication().getWriteObjects());
//
//		// Multiples
//		for (FeatureCVTermProperty fcvtprop : this.getFeatureCVTermProperties())
//			writeObjects.addAll(fcvtprop.getWriteObjects());
//		for (FeatureCVTermPublication fcvtpub : this.getFeatureCVTermPublications())
//			writeObjects.addAll(fcvtpub.getWriteObjects());
//		for (FeatureCVTermDBXref fcvtdbx : this.getFeatureCVTermDBXrefs())
//			writeObjects.addAll(fcvtdbx.getWriteObjects());
//		
//		return writeObjects;
//	}

	public AbstractSimpleObjectIterator getWriteableObjects()
	{
		return new SimpleObjectIterator(this);
	}

	private static class SimpleObjectIterator extends AbstractSimpleObjectIterator
	{
		private static class Status extends AbstractSimpleObjectIterator.Status
		{
			public static final int cvterm = 1;
			public static final int pub = 2;
			public static final int featureCvtermProps = 3;
			public static final int featureCvtermPubs = 4;
			public static final int featureCvtermDbxrefs = 5;
		}
				
		public SimpleObjectIterator(FeatureCVTerm featureCvterm)
		{
			super(featureCvterm);
		}

		public AbstractSimpleObject next()
		{
			FeatureCVTerm featureCvterm = (FeatureCVTerm)object;
			AbstractSimpleObject retVal = null;
			if (status == Status.self) {
				retVal = peek();
				processSingletonIterator(Status.cvterm, featureCvterm.getCvterm());
			}
			else {
				retVal = soIter.next();
				if (status == Status.cvterm) {
					processSingletonIterator(Status.pub, featureCvterm.getPublication());				}
				if (status == Status.pub) {
					processCollectionIterators(Status.featureCvtermProps, featureCvterm.getFeatureCVTermProperties());
				}
				if (status == Status.featureCvtermProps) {
					processCollectionIterators(Status.featureCvtermPubs, featureCvterm.getFeatureCVTermPublications());
				}
				if (status == Status.featureCvtermPubs) {
					processCollectionIterators(Status.featureCvtermDbxrefs, featureCvterm.getFeatureCVTermDBXrefs());
				}
				if (status == Status.featureCvtermDbxrefs) {
					processLastCollectionIterator();
				}
			}
			current = retVal;
			return retVal;
		}

	}

}
