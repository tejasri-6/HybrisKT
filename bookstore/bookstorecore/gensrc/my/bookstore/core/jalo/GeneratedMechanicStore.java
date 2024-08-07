/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Aug 6, 2024, 7:24:35 PM                     ---
 * ----------------------------------------------------------------
 */
package my.bookstore.core.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import my.bookstore.core.constants.BookstoreCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem MechanicStore}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedMechanicStore extends GenericItem
{
	/** Qualifier of the <code>MechanicStore.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>MechanicStore.description</code> attribute **/
	public static final String DESCRIPTION = "description";
	/** Qualifier of the <code>MechanicStore.rating</code> attribute **/
	public static final String RATING = "rating";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(DESCRIPTION, AttributeMode.INITIAL);
		tmp.put(RATING, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MechanicStore.description</code> attribute.
	 * @return the description
	 */
	public String getDescription(final SessionContext ctx)
	{
		return (String)getProperty( ctx, DESCRIPTION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MechanicStore.description</code> attribute.
	 * @return the description
	 */
	public String getDescription()
	{
		return getDescription( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MechanicStore.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final SessionContext ctx, final String value)
	{
		setProperty(ctx, DESCRIPTION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MechanicStore.description</code> attribute. 
	 * @param value the description
	 */
	public void setDescription(final String value)
	{
		setDescription( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MechanicStore.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MechanicStore.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MechanicStore.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MechanicStore.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MechanicStore.rating</code> attribute.
	 * @return the rating
	 */
	public String getRating(final SessionContext ctx)
	{
		return (String)getProperty( ctx, RATING);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MechanicStore.rating</code> attribute.
	 * @return the rating
	 */
	public String getRating()
	{
		return getRating( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MechanicStore.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final SessionContext ctx, final String value)
	{
		setProperty(ctx, RATING,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MechanicStore.rating</code> attribute. 
	 * @param value the rating
	 */
	public void setRating(final String value)
	{
		setRating( getSession().getSessionContext(), value );
	}
	
}
