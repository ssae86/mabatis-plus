package com.cda.pkg;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.cda.generator.CodeGenerator;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author cdastart
 * @create 2021-11-13 8:34
 */
public class PkgGenerator {

    public static void main(String[] args) {
//        String pkgPath = System.getProperty("user.dir") + "/src/main/java";
//        FastAutoGenerator.create(CodeGenerator.URL, "root", "123456")
//                //全局配置
//                .globalConfig(builder -> {
//                    builder.author("cda") // 设置作者
//                            .outputDir("C:\\Users\\陈大澳\\Desktop\\code"); // 指定输出目录
//                })
//                //包配置
//                .packageConfig(builder -> builder.parent("com.cda"))
//                .strategyConfig(builder -> {
//                    builder.addInclude("user"); // 设置需要生成的表名
//                })
//                .execute();
        String pkgPath = System.getProperty("user.dir") + "/src/main/java";
        String XmlPath = System.getProperty("user.dir") + "resources";

        FastAutoGenerator.create(CodeGenerator.URL, "root", "123456")
                //全局配置
                .globalConfig(builder -> {
                    builder.author("cda") // 设置作者
                    .outputDir("pkgPath")// 指定输出目录
                    .fileOverride();    //默认覆盖之前的生成代码
                })
//                包配置
                .packageConfig(builder -> builder.parent("com.cda") //父包
                      )  //指定实体类生成在po包
//                .packageConfig((scanner,builder) -> builder.parent("com.cda." + scanner.apply("请输入要制定的模块名称：")))
//                .strategyConfig((scanner,builder) -> builder.addInclude(scanner.apply("请输入表名：")))
//                策略配置
                .strategyConfig(builder -> {
                    builder.addInclude(Arrays.asList("user","category","orders")); // 设置需要生成的表名
                })
                .execute();
    }

}
