package org.lightadmin.config;

import org.lightadmin.core.config.annotation.Administration;
import org.lightadmin.core.config.domain.common.FieldSetConfigurationUnitBuilder;
import org.lightadmin.core.config.domain.context.ScreenContextConfigurationUnit;
import org.lightadmin.core.config.domain.context.ScreenContextConfigurationUnitBuilder;
import org.lightadmin.core.config.domain.unit.FieldSetConfigurationUnit;
import org.lightadmin.test.model.TestOrder;
import org.lightadmin.test.renderer.LineItemRenderer;

@SuppressWarnings( "unused" )
@Administration( TestOrder.class )
public class OrderTestEntityConfiguration {

	public static ScreenContextConfigurationUnit screenContext( ScreenContextConfigurationUnitBuilder screenContextBuilder ) {
		return screenContextBuilder
				.screenName( "Administration of Test Order Domain" )
				.menuName( "Test Order Domain" ).build();
	}

	public static FieldSetConfigurationUnit listView( FieldSetConfigurationUnitBuilder listViewBuilder ) {
		return listViewBuilder
				.field( "id" ).caption( "ID" )
				.field( "name" ).caption( "Name" )
				.renderable( new LineItemRenderer() ).caption( "Line Items" ).build();
	}
}