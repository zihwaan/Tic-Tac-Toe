# SKKU Sam-Mok Game with AI
성균관대학교 JAVA프로그래밍실습 과제
## 개요
이 프로젝트는 Java로 구현된 삼목(Tic-Tac-Toe) 게임으로, 사용자가 AI(SKKU Bot)와 대결할 수 있는 GUI 기반 애플리케이션입니다. Minimax 알고리즘을 활용한 AI가 최적의 수를 계산하며, 게임 진행 상황을 기록하고 점수를 표시합니다. Swing을 사용하여 메뉴와 게임 보드를 시각적으로 제공합니다.

## 주요 기능
- **AI 대전**: Minimax 알고리즘을 통해 SKKU Bot이 최적의 수를 계산하여 사용자와 대결.
- **게임 상태 관리**: 3x3 보드에서 승리, 패배, 무승부를 판단하고 점수 업데이트.
- **GUI**: 메인 메뉴와 게임 플레이 화면을 제공하며, 버튼 클릭으로 게임 진행.
- **히스토리 기록**: 게임 진행 기록을 텍스트 파일로 저장 가능.

## 파일 구조
- **`Game_Algorithm.java`**: 게임 로직과 Minimax 알고리즘 구현.
- **`Gui_manu_of_game.java`**: 메인 메뉴 GUI.
- **`Gui_play_of_game.java`**: 게임 플레이 화면 GUI.
- **`Pannels.java`**: 게임 보드 상태 관리.
- **`Sam_mok.java`**: 메인 실행 파일.
- **`User.java`**: 플레이어 정보 관리 (이름, 승리 횟수, 기호).
- **`assets/`**: 게임에 사용되는 이미지 파일 (예: `skku.png`, `me.png` 등).

## 사용 방법
1. **필요 조건**
   - Java Development Kit (JDK) 8 이상.
   - Swing 지원 환경.

2. **컴파일 및 실행**
   ```bash
   javac -d . game/*.java
   java game.Sam_mok
   ```
   - 실행 시 메인 메뉴가 표시되며, "Play with AI" 버튼으로 게임 시작.

3. **사용 예시**
   - **메인 메뉴**: "Play with AI"로 게임 시작, "Information about this game"으로 규칙 확인.
   - **게임 플레이**:
     - "Start Sam-Mok" 버튼으로 게임 초기화.
     - 보드의 버튼을 클릭해 'X' 또는 'O'를 배치.
     - SKKU Bot이 자동으로 응답.
     - "Reset"으로 보드 초기화, "Write History"로 게임 기록 저장.
   - **결과**: 승리, 패배, 무승부 시 메시지 창 표시 및 점수 업데이트.

## 코드 구조
- **`Game_Algorithm`**: 
  - Minimax 알고리즘(`recur_Cost_Func`)으로 AI 수 계산.
  - 승리 여부 판단(`cal_score_If_Win`) 및 최적 이동 계산(`Calculate_Solution`).
- **`Gui_manu_of_game`**:
  - 메인 메뉴 UI 구성(SKKU 로고, 시작 버튼 등).
  - 게임 시작 시 플레이 화면으로 전환.
- **`Gui_play_of_game`**:
  - 3x3 보드와 점수판 UI 제공.
  - 버튼 클릭 이벤트로 사용자 입력 처리 및 AI 응답.
- **`Pannels`**:
  - 보드 상태 초기화 및 관리.
  - 게임 히스토리 문자열 저장.
- **`User`**:
  - 플레이어 정보(기호, 승리 횟수) 관리.
- **`Sam_mok`**:
  - 게임 객체 초기화 및 실행.

## 제한사항
- AI는 항상 최적의 수만 계산하며, 난이도 조절 불가.
- 게임 기록은 `History.txt`에 덮어쓰기 방식으로 저장.
- 보드 크기가 3x3으로 고정되어 확장 불가.
