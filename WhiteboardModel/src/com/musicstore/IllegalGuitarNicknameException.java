package com.musicstore;

public class IllegalGuitarNicknameException extends IllegalArgumentException{

    public IllegalGuitarNicknameException() {
    }

    public IllegalGuitarNicknameException(String s) {
        super(s);
    }

    public IllegalGuitarNicknameException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalGuitarNicknameException(Throwable cause) {
        super(cause);
    }
}
