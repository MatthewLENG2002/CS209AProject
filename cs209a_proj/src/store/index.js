import {createStore} from 'vuex'

export default createStore({
    state: {
        repo1_name: 'repoooo1',
        repo2_name: 'repoooo2',
        developer_num: 123,
        open_issue_num: 52,
        closed_issue_num: 30,
        issue_avg: 6,
        release_num: 40,
        issue_box: [1, 2, 3, 4, 5],
        issue_variance: 1.7,
        issue_top10_name: ['llll', 'hif kjo jkh', 'vvvvv', 'yuyuy', 'jjjjj', 'oooooo', 'iji', 'ooo', '9i9', "1010"],
        issue_top10_duration: [111, 22, 33, 444, 5, 66, 777, 88, 9999, 10],
        developer_chart_y: ['Brazil', 'Indonesia', 'USA', 'India', 'China', 'World', 'developer8', 'd9', "d10", 'iii'],
        developer_chart_x: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
        issue_scatter: [
            [10.0, 8.04],
            [8.07, 6.95],
            [13.0, 7.58],
            [9.05, 8.81],
            [11.0, 8.33],
            [14.0, 7.66],
            [13.4, 6.81],
            [10.0, 6.33],
            [14.0, 8.96],
            [12.5, 6.82],
            [9.15, 7.2],
            [11.5, 7.2],
            [3.03, 4.23],
            [12.2, 7.83],
            [2.02, 4.47],
            [1.05, 3.33],
            [4.05, 4.96],
            [6.03, 7.24],
            [12.0, 6.26],
            [12.0, 8.84],
            [7.08, 5.82],
            [5.02, 5.68]
        ],
        issue_keyword:['bug', 'lalala', 'javafx', 'springboot', 'ooo', 'socket', 'web', 'reflection', 'import', 'input']
    },
    getters: {
        getTime(state) {
            return state.time
        },
        getRepo1Name(state) {
            return state.repo1_name
        },
        getRepo2Name(state) {
            return state.repo2_name
        },
        getDevelopers(state) {
            return state.developer_num
        },
        getOpenIssues(state) {
            return state.open_issue_num
        },
        getCloseIssues(state) {
            return state.closed_issue_num
        },
        getIssueAvg(state) {
            return state.issue_avg
        },
        getReleases(state) {
            return state.release_num
        },
        getIssueBox(state) {
            return state.issue_box
        },
        getIssueVariance(state) {
            return state.issue_variance
        },
        getIssueTop10Name(state) {
            return state.issue_top10_name
        },
        getIssueTop10Duration(state) {
            return state.issue_top10_duration
        },
        getDeveloperChartY(state) {
            return state.developer_chart_y
        },
        getDeveloperChartX(state) {
            return state.developer_chart_x
        },
        getIssueScatter(state) {
            return state.issue_scatter
        },
        getIssueKeyword(state){
            return state.issue_keyword
        }
    },
    mutations: {
        setTime(state, time) {
            state.time = time
        }
    },
    actions: {},
    modules: {}
})
