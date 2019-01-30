package core;

import sample.Sample;
import sample.SampleService;
import util.Logger;
import zakki.CollectionUtils;

public class Main {
	public static void main(String[] args) {
		SampleService service = new SampleService();
		service.sayHello();

		Logger.log("4core Main");
		Sample sample = new Sample();
		sample.setId(555);
		Logger.log(sample.toString());
		CollectionUtils.sample();
	}
}
