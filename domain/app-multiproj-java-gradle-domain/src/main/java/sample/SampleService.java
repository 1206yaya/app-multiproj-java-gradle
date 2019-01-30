package sample;

import util.Logger;
import zakki.CollectionUtils;

public class SampleService {
	public String sayHello() {
		Sample sample = new Sample();
		sample.setId(1);
		Logger.log("5domain sayHello");
		Logger.log(sample.toString());
		CollectionUtils.sample();
		return "Gradle sample.";
	}

}
