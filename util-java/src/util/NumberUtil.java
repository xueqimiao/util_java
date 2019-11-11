package util;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;

public class NumberUtil
{

	public final static Map<String, Integer> unitMap = new java.util.HashMap<String, Integer>();

	public final static Map<String, Integer> numMap = new java.util.HashMap<String, Integer>();

	private static ScriptEngine engine = null;

	static
	{
		unitMap.put("十", 10);
		unitMap.put("百", 100);
		unitMap.put("千", 1000);
		unitMap.put("万", 10000);
		unitMap.put("亿", 100000000);

		unitMap.put("拾", 10);
		unitMap.put("佰", 100);
		unitMap.put("仟", 1000);
		unitMap.put("萬", 10000);
		unitMap.put("億", 100000000);

		numMap.put("零", 0);
		numMap.put("一", 1);
		numMap.put("二", 2);
		numMap.put("三", 3);
		numMap.put("四", 4);
		numMap.put("五", 5);
		numMap.put("六", 6);
		numMap.put("七", 7);
		numMap.put("八", 8);
		numMap.put("九", 9);

		numMap.put("壹", 1);
		numMap.put("貳", 2);
		numMap.put("叁", 3);
		numMap.put("肆", 4);
		numMap.put("伍", 5);
		numMap.put("陸", 6);
		numMap.put("柒", 7);
		numMap.put("捌", 8);
		numMap.put("玖", 9);

		ScriptEngineManager factory = new ScriptEngineManager();
		engine = factory.getEngineByName("JavaScript");
	}

	/**
	 * Convert chinese number characters to Arabic number string.
	 * 
	 * @param chinese Chinese number characters.
	 * @return Arabic number string.
	 */
	public static String convertChinese2NumberString(String chinese)
	{
		char[] charArray = chinese.toCharArray();
		String numberString = "";
		String numNumberString = "";
		for (int i = 0; i < charArray.length; i++)
		{
			String charStr = String.valueOf(charArray[i]);
			Integer intNumber = numMap.get(charStr);
			Integer unitNumber = unitMap.get(charStr);
			if (intNumber != null)
			{
				numberString += charStr;
			}
			else if (unitNumber != null)
			{
				numberString += charStr;
			}
			else
			{
				numNumberString += charStr;
			}
		}
		if (!ValidationUtil.isEmpty(numberString))
		{
			Integer intNumber = chinese2Number(numberString);
			if (intNumber != null)
			{
				return intNumber + numNumberString;
			}
		}
		return chinese;
	}

	/**
	 * Convert Chinese number characters to Arabic number.
	 * 
	 * @param chinese Chinese number characters.
	 * @return Arabic number. 
	 */
	public static Integer chinese2Number(String chinese)
	{
		Queue<String> queue = new LinkedList<String>();
		queue.offer("1");
		queue.offer("*");

		char[] chars = chinese.toCharArray();

		boolean isFirstNunber = true;
		for (int i = 0; i < chars.length; i++)
		{
			String charStr = String.valueOf(chars[i]);
			Integer unitNumber = unitMap.get(charStr);
			Integer number = numMap.get(charStr);
			if (unitNumber != null)
			{
				if (!isFirstNunber)
				{
					queue.offer("*");
				}
				isFirstNunber = false;
				queue.offer(unitNumber + "");
			}
			else if (number != null)
			{
				if (!isFirstNunber)
				{
					queue.offer("+");
				}
				isFirstNunber = false;
				queue.offer(number + "");
			}
		}

		return countNumber(queue);
	}

	/**
	 * This method is used to get the result of the math calculation for the math expressions.
	 * 
	 * @param queue The queue for the math expression.
	 * @return Result.
	 */
	private static Integer countNumber(Queue<String> queue)
	{
		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty())
		{
			sb.append(queue.poll());
		}
		String expression = sb.toString();
		Object o = null;
		try
		{
			o = engine.eval(expression);
		}
		catch (ScriptException e)
		{
			// TODO exception handler.
		}
		String result = String.valueOf(o);
		Double d = Double.valueOf(result);
		return d.intValue();

	}

	/**
	 * 获取范围内的随机数
	 * @param min
	 * @param max
     * @return
     */
	public static Integer getRandom(int min, int max){
		Random random = new Random();
		Integer s = random.nextInt(max) % (max - min + 1) + min;
		return s;
	}

}
