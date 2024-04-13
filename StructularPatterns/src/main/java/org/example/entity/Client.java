package org.example.entity;

import org.example.enums.OverviewType;
import org.example.factory.OverviewDecoratorFactory;
import org.example.factory.OverviewStrategyFactory;
import org.example.factory.OverviewTemplateMethodFactory;
import org.example.services.decorator.IOverview;
import org.example.services.strategy.IStrategyOverview;
import org.example.services.template.OverviewTemplateMethod;

public class Client {
	public static void main(String[] args) {
		Car c1 = new Car("Fiat Punto");
		Car c2 = new Car("Skodia Fabia");
		Car c3 = new Car("BMW M3");
//		OverviewTemplateMethod normal = OverviewTemplateMethodFactory.create(OverviewType.NORMAL);
//		OverviewTemplateMethod airCondition = OverviewTemplateMethodFactory.create(OverviewType.AIR_CONDITION);
//		OverviewTemplateMethod diesel = OverviewTemplateMethodFactory.create(OverviewType.DIESEL);
//		diesel.makeOverview(c2);
//		IOverview normal = OverviewDecoratorFactory.create(OverviewType.NORMAL);
//		IOverview airCondition = OverviewDecoratorFactory.create(OverviewType.AIR_CONDITION);
//		IOverview diesel = OverviewDecoratorFactory.create(OverviewType.DIESEL);
//		airCondition.makeOverview(c1);
		IStrategyOverview normal = OverviewStrategyFactory.create(OverviewType.NORMAL);
		IStrategyOverview airCondition = OverviewStrategyFactory.create(OverviewType.AIR_CONDITION);
		IStrategyOverview diesel = OverviewStrategyFactory.create(OverviewType.DIESEL);
		airCondition.makeOverview(c1);
	}
}
