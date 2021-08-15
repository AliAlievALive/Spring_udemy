package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: in library try returned book");

        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        targetMethodResult = "Prestuplenie and Nakazanie";
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: in library correct returned book");
        System.out.println("aroundReturnBookLoggingAdvice: method returnBook working " + (end-begin) + " millisecond");
        return targetMethodResult;
    }
}
