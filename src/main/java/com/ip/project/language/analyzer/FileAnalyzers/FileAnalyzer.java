package com.ip.project.language.analyzer.FileAnalyzers;

import com.ip.project.language.analyzer.cryteria.CriteriaMatcher;

/**
 * Created by.
 */
public interface FileAnalyzer<T extends CriteriaMatcher> {
    void analyzeFile();
}
