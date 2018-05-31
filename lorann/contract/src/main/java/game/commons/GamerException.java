package game.commons;

public class GamerException extends Exception {

		public GamerException(String message) {
			super(message);
		}

		public GamerException(Throwable cause) {
			super(cause);
		}

		public GamerException(String message, Throwable cause) {
			super(message, cause);
		}

		public GamerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
			super(message, cause, enableSuppression, writableStackTrace);
		}
	}