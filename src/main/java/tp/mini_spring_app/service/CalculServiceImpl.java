package tp.mini_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class CalculServiceImpl implements CalculService {

	@Override
	public double moyenne(double a, double b) {
		return (a+b)/2;
	}
}
