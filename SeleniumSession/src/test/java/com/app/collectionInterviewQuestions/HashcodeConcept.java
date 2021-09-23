package com.app.collectionInterviewQuestions;

public class HashcodeConcept {

	public static void main(String... hashcodeExample) {
		Simpson homer = new Simpson(1, "Homer");
		Simpson bart = new Simpson(1, "Homer");

		System.out.println("Hash Code value of Homer: " + homer.hashCode());
		System.out.println("Hash Code value of Bart: " + bart.hashCode());
		boolean isHashcodeEquals = homer.hashCode() == bart.hashCode();
		System.out.println("Hash Code value is: " + isHashcodeEquals);

		if (isHashcodeEquals) {
			System.out.println("Should compare with equals method too.");
		} else {
			System.out
					.println("Should not compare with equals method because "
							+ "the id is different, that means the objects are not equals for sure.");
		}
	}

	static class Simpson {
		int id;
		String name;

		public Simpson(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null || getClass() != o.getClass())
				return false;
			Simpson simpson = (Simpson) o;
			return id == simpson.id && name.equals(simpson.name);
		}

		@Override
		public int hashCode() {
			return id;
		}
	}
}