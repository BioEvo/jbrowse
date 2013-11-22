package org.gmod.gbol.simpleObject;

/*
 * Autogenerated extension of org.gmod.gbol.simpleObject.generated.DB.
 * Add custom code to this file. 
 *
 * Author: Robert Bruggner, rbruggner@berkeleybop.org
 *
*/

public class DB extends org.gmod.gbol.simpleObject.generated.AbstractDB {

	private static final long serialVersionUID = 1L;

	public DB(){
		super();
	}
	
	public DB(String db) {
		super(db);
	}


	public AbstractSimpleObjectIterator getWriteableObjects()
	{
		return new SimpleObjectIterator(this);
	}
	
	private static class SimpleObjectIterator extends AbstractSimpleObjectIterator
	{

		private static class Status extends AbstractSimpleObjectIterator.Status
		{
			public static final int done = 1;
		}
		
		public SimpleObjectIterator(DB db)
		{
			super(db);
		}
		
		public AbstractSimpleObject next()
		{
			AbstractSimpleObject retVal = null;
			if (status == Status.notSet) {
				retVal = peek();
				status = Status.done;
			}
			current = retVal;
			return retVal;
		}
	}
	public String toString() {
		String res = "";
		if (getName() != null)
			res += getName();
		res += "(";
		if (getDescription() != null)
			res += getDescription() + ":";
		if (getUrl() != null)
			res += getUrl();
		res += ")";
		return res;
	}
}
