package game.commons;

public class GamerException extends Exception {

	public GamerException() {

		public GamerException(String message2) {
			super(message2);
		}

		public GamerException(Throwable cause) {
			super(cause);
		}

		public GamerException(String message2, Throwable cause) {
			super(message2, cause);
		}

		public GamerException(String message2, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
			super(message2, cause, enableSuppression, writableStackTrace);
		}
	}

}
