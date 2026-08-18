# TASK 5

## Dependency Structure Analysis of Pre-LLM and LLM-Generated Java Code

**Submitted By-**
Name: Mahin Ahmed Meghla
ID: 2022-3-60-152
Course Code: Cse423
Date: 18 August, 2026

**Submitted To-**
Proma Chowdhury, Lecturer
Department of Computer Science and Engineering (CSE)
East West University.

---

## Introduction

This report presents the complete Task 5 experiment using 80 Java source files: 40 original Pre-LLM files and 40 LLM-generated files. It covers the code-generation workflow, dependency graphs, required metrics, comparison, reflection, and the evidence required by the marking rubric.

Where the available evidence does not verify a historical fact, this report states that limitation explicitly instead of presenting reconstructed information as fact.

## 1. Task Overview

The purpose of the experiment is to compare the dependency architecture of an original Java codebase with a second version reconstructed from class descriptions using an LLM.

The workflow is:

- Select the original 40 Java files.
- Prepare a description for each original class.
- Use the descriptions to generate 40 Java files with an LLM.
- Build a dependency graph for the original 40 files.
- Build a dependency graph for the generated 40 files.
- Create individual graph views for all 80 files.
- Calculate GED, Cycle Count, and CSS.
- Compare the two dependency structures and discuss the architectural differences.

## 2. Repository Selection and Pre-LLM System Snapshot

The working analysis uses the original 40-file Java source set identified in the project materials. The selected files represent OFBiz-related service, entity, MiniLang, widget, content, security, order, accounting, party, and product functionality.

For the dependency comparison, the 40 selected Java classes are treated as graph nodes. An edge is included only when one selected class directly depends on another selected class. External Java, OFBiz framework, and library classes are not added as nodes in the 40-node comparison graph.

The original Pre-LLM graph contains 40 nodes, 8 internal dependency edges, 0 cycles, and a maximum in-degree of 3.

The current evidence does not verify the repository URL, commit history, LOC, or a pre-2020 commit/date. These must be attached from the actual repository before claiming that the historical repository-selection requirements are fully satisfied.

## 3. Description-to-Code LLM Workflow

Each original Java file was described in terms of its file/class name, responsibility, functionality, important dependencies, and system role. These descriptions were then used as the input specification for generating a second set of 40 Java files.

The LLM-generated set is therefore a reconstruction from descriptions, not a claim that the original implementation was reproduced line-for-line.

The generated set contains 40 Java files/classes and was reported as successfully checked with javac. The generated files preserve the corresponding class/file identities so that the two versions can be compared structurally.

## 4. Prompt Design and Iterative Refinement

The workflow included prompts for: preparing the 40 descriptions, generating the 40 Java files, refining/checking the generated code, extracting the two dependency graphs, calculating the required metrics, and preparing the final analysis.

The full workflow prompt texts are included in the accompanying `FULL_PROMPT_TEXTS.md` file.

**Important evidence limitation:** the retrieved materials do not preserve the exact historical wording of the original prompt iterations. Therefore, the included full prompt texts are marked as reconstructed workflow prompts and are not presented as verbatim historical records.

Ma'am's rubric requires at least three actual prompt iterations, the problem observed after each iteration, and the reason for each refinement. Those historical records must be recovered from the original chat/export if they are required for full marks. No iteration history is fabricated in this report.

## 5. LLM-Generated Code Quality

The generated side consists of 40 Java source files rather than a single code block. The available verification record reports successful javac compilation. This supports the claim that the generated output was sufficiently complete and syntactically valid for compilation and dependency analysis.

The generated code should be evaluated as a description-based reconstruction. It should not be described as a complete reproduction of the original OFBiz implementation.

## 6. Dependency Graph Construction

Two separate directed dependency graphs were constructed.

| System | Files/Nodes | Internal Edges | Cycles |
|---|---|---|---|
| Pre-LLM / Original | 40 | 8 | 0 |
| LLM-generated | 40 | 35 | 1 |
| **Complete experiment** | **80 source files** | **Two 40-node graphs** | **1 LLM-side cycle** |

In addition to the two full graphs, the submission contains 40 individual Pre-LLM graph views and 40 individual LLM-generated graph views, giving 80 individual file-level graph views.

## 7. Required Metrics

### 7.1 Graph Edit Distance (GED)

Both graphs contain the same 40 selected class nodes. Seven dependency edges are common to both graphs.

- Edge removals = 8 − 7 = 1.
- Edge insertions = 35 − 7 = 28.

**Therefore: GED = 1 + 28 = 29 edits.**

GED measures the structural change required to transform the Pre-LLM dependency graph into the LLM-generated dependency graph.

### 7.2 Cycle Count (CC)

The Pre-LLM graph contains 0 cycles. The LLM-generated graph contains 1 cycle.

Under the README definition, the Cycle Count for the LLM graph is therefore **CC = 1**.

This means that one cyclic dependency appears in the generated dependency structure where the original selected-file graph has none.

### 7.3 Centralization Shift Score (CSS)

The README defines CSS as CSS = Cmax(G_L) − Cmax(G_H). The README defines Cmax as maximum node centrality but does not specify the centrality type.

For this directed dependency graph, directed in-degree centrality is used and stated explicitly: C(v) = in-degree(v)/(N−1), with N = 40.

- Pre-LLM: Cmax(G_H) = 3/39 = 0.0769.
- LLM-generated: Cmax(G_L) = 4/39 = 0.1026.

**CSS = 0.1026 − 0.0769 = +0.0256.**

Because CSS is positive, the LLM-generated graph is more centralized under the selected in-degree centrality measure.

## 8. Final Metric Comparison

| Metric | Pre-LLM | LLM-generated | Interpretation |
|---|---|---|---|
| Nodes | 40 | 40 | Same selected class set |
| Internal dependency edges | 8 | 35 | 27 additional LLM-side edges |
| Cycle Count | 0 | 1 | One cycle introduced |
| Maximum in-degree | 3 | 4 | Increase of 1 |
| Maximum in-degree centrality | 0.0769 | 0.1026 | Increase of 0.0256 |
| GED | — | — | 29 edits between the graphs |
| CSS | — | — | +0.0256 |

## 9. Comparative Analysis

The strongest difference is graph density within the selected 40-file boundary. The original graph contains 8 internal edges, while the LLM-generated graph contains 35. Thus, the generated version has 27 more internal dependency relationships.

The GED of 29 confirms that the dependency structures are substantially different. The change is not simply a small rearrangement of the original graph.

The LLM-generated graph also introduces one cycle. This is structurally significant because the original selected-file graph has no cycle.

The positive CSS indicates that the generated graph has a more centralized dependency structure under the chosen in-degree measure.

These results do not by themselves establish that the LLM-generated code is better or worse. They show that reconstructing software from descriptions can preserve class-level responsibilities while changing the underlying dependency architecture.

## 10. Final Dependency Graphs and Individual Evidence

The submission package contains:

- Pre-LLM dependency graph — 40 nodes.
- LLM-generated dependency graph — 40 nodes.
- Final comparison graph.
- 40 individual Pre-LLM graph PNGs.
- 40 individual LLM-generated graph PNGs.
- 80 individual graph views in total.

The individual graphs are supporting evidence for the two graph systems. GED, CC, and CSS are calculated on the two underlying 40-node graphs, not as 80 separate metric calculations.

## 11. Complete 80-Code Scope

The complete experiment contains 80 Java source files: 40 original files plus 40 LLM-generated files. The two sets are compared as two 40-node dependency systems.

For a reproducible GitHub submission, the actual 40 original .java files and actual 40 generated .java files must be uploaded. The current report does not create substitute source files or claim placeholders are the real source.

## 12. Limitations

- The dependency graph is restricted to the selected 40 classes; external framework and library dependencies are not represented as graph nodes.
- The LLM-generated code is reconstructed from descriptions rather than reproduced line-by-line from the original implementation.
- The README does not specify the centrality type for Cmax, so directed in-degree centrality is used and explicitly disclosed.
- The retrieved evidence does not verify the pre-2020 repository snapshot required by the rubric.
- The retrieved evidence does not preserve the exact historical prompt wording or three verified prompt iterations.

## 13. Rubric Evidence Status

| Rubric Area | Current Status | Evidence Needed for Full Claim |
|---|---|---|
| Repository selection | Partial | Actual repository URL, history/commit evidence, LOC/folder evidence and required snapshot evidence |
| Pre-LLM snapshot | Partial | Verified pre-2020 commit/hash/date evidence |
| Prompt design | Partial | Exact historical prompt and 3+ actual iterations with refinement reasons |
| Generated code quality | Supported | 40 actual generated .java files and compilation evidence |
| Metrics | Supported | Graphs + calculations: GED 29, CC 1, CSS +0.0256 |
| Comparison/reflection | Supported | Comparison, task-specific observations, limitations |

This status table is intentionally honest. It prevents reconstructed prompts or unverified repository history from being presented as historical evidence.

## 14. Final Conclusion

The Task 5 experiment compares 40 original Java files with 40 LLM-generated Java files, giving 80 Java source files in total. The original dependency graph contains 8 internal edges and no cycles, while the LLM-generated graph contains 35 internal edges and one cycle.

The resulting GED is 29 edits. Under the explicitly selected directed in-degree centrality measure, the maximum centrality changes from 0.0769 to 0.1026, giving CSS = +0.0256.

The overall finding is that the LLM reconstruction changes the dependency architecture substantially. It produces a denser and slightly more centralized dependency structure and introduces a cycle that is absent from the original selected-file graph.

The technical analysis is complete. The remaining rubric work is documentary: attaching the actual repository/pre-2020 evidence and the actual historical prompt/refinement records where required.
