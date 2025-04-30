package challenge01_03;

public class Girl {
	protected String name;

	void show() {
		System.out.println(name + "는 자바를 잘 안다.");
	}

	Girl(String name) {
		this.name = name;
	};

}

class GoodGirl extends Girl {
	void show() {
		System.out.println(name + "는 자바를 잘 안다.");
	}

	GoodGirl(String name) {
		super(name);
	}
}

class BestGirl extends GoodGirl {
	void show() {
		System.out.println(name + "는 자바를 무지하게 잘 안다.");
	}

	BestGirl(String name) {
		super(name);
	}
}