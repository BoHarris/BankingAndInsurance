
package com.solvd.bankingandinsurance.wordcount;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WordCount {
	private static final Logger log = LogManager.getLogger(WordCount.class.getName());

	public static void main(String[] args) throws IOException {
		String lines = FileUtils.readFileToString(new File("C:\\Banking\\speechfile.txt"), Charset.defaultCharset());
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = lines.toLowerCase().replaceAll("[^a-zA-Z1-9\\-\\' ]", "").split(" ");
		for (String word : words) {
			if (map.put(word, 1) != null) {
				map.put(word, map.get(word) + 1);
			}
		}
		FileUtils.writeStringToFile(new File("C:\\Banking\\output.txt"), String.valueOf(map), "UTF-8");
	}

}
