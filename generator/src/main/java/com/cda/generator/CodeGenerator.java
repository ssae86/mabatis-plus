package com.cda.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author cdastart
 * @create 2021-11-13 8:34
 */
public class CodeGenerator {
    public static final String URL = "jdbc:mysql://localhost:3306/db_mall?useSSL=false&serverTimezone=GMT";

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, "root", "123456")
                .globalConfig(builder -> {
                    builder.author("cda") // 设置作者
                            .outputDir("C:\\Users\\陈大澳\\Desktop\\code"); // 指定输出目录
                })
                .strategyConfig(builder -> {
                    builder.addInclude(Arrays.asList("user","category","orders","index_img")); // 设置需要生成的表名
                })
                .execute();
    }

}
