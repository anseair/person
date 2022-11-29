package telran.java2022.person.dto.exceptoins;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnknownPersonTypeException extends RuntimeException {


	private static final long serialVersionUID = 6071354472988938215L;

}
