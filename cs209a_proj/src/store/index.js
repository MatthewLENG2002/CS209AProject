import {createStore} from 'vuex'
import request from "@/utils/request";

export default createStore({
    state: {
        repo1_id: 9999,
        repo2_id: 8888,
        repo1_name: 'repoooo1',
        repo2_name: 'repoooo2',
        repo_name:'reoooo1',
        repo_description: 'repo111111111111',
        developer_num: 123,
        open_issue_num: 56,
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
        issue_noun_keyword: ['bug', 'lalala', 'javafx', 'springboot', 'ooo', 'socket', 'web', 'reflection', 'noun1', 'noun2'],
        issue_verb_keyword: ['debug', 'hahaha', 'select', 'compile', 'ggg', 'run', 'web', 'reflect', 'import', 'input'],
        releases_chart_x: ['release1', 'release2', 'release3', 'release4', 'release5', 'release6', 'release7', 'release8', 'release9', 'release10'],
        releases_chart_y: [300, 280, 250, 260, 270, 300, 550, 500, 400, 390],
        // 少peak数据
        commit_time: [[0, 0, 5], [0, 1, 1], [0, 2, 0], [0, 3, 0], [0, 4, 0], [0, 5, 0], [0, 6, 0], [0, 7, 0], [0, 8, 0], [0, 9, 0], [0, 10, 0], [0, 11, 2], [0, 12, 4], [0, 13, 1], [0, 14, 1], [0, 15, 3], [0, 16, 4], [0, 17, 6], [0, 18, 4], [0, 19, 4], [0, 20, 3], [0, 21, 3], [0, 22, 2], [0, 23, 5], [1, 0, 7], [1, 1, 0], [1, 2, 0], [1, 3, 0], [1, 4, 0], [1, 5, 0], [1, 6, 0], [1, 7, 0], [1, 8, 0], [1, 9, 0], [1, 10, 5], [1, 11, 2], [1, 12, 2], [1, 13, 6], [1, 14, 9], [1, 15, 11], [1, 16, 6], [1, 17, 7], [1, 18, 8], [1, 19, 12], [1, 20, 5], [1, 21, 5], [1, 22, 7], [1, 23, 2], [2, 0, 1], [2, 1, 1], [2, 2, 0], [2, 3, 0], [2, 4, 0], [2, 5, 0], [2, 6, 0], [2, 7, 0], [2, 8, 0], [2, 9, 0], [2, 10, 3], [2, 11, 2], [2, 12, 1], [2, 13, 9], [2, 14, 8], [2, 15, 10], [2, 16, 6], [2, 17, 5], [2, 18, 5], [2, 19, 5], [2, 20, 7], [2, 21, 4], [2, 22, 2], [2, 23, 4], [3, 0, 7], [3, 1, 3], [3, 2, 0], [3, 3, 0], [3, 4, 0], [3, 5, 0], [3, 6, 0], [3, 7, 0], [3, 8, 1], [3, 9, 0], [3, 10, 5], [3, 11, 4], [3, 12, 7], [3, 13, 14], [3, 14, 13], [3, 15, 12], [3, 16, 9], [3, 17, 5], [3, 18, 5], [3, 19, 10], [3, 20, 6], [3, 21, 4], [3, 22, 4], [3, 23, 1], [4, 0, 1], [4, 1, 3], [4, 2, 0], [4, 3, 0], [4, 4, 0], [4, 5, 1], [4, 6, 0], [4, 7, 0], [4, 8, 0], [4, 9, 2], [4, 10, 4], [4, 11, 4], [4, 12, 2], [4, 13, 4], [4, 14, 4], [4, 15, 14], [4, 16, 12], [4, 17, 1], [4, 18, 8], [4, 19, 5], [4, 20, 3], [4, 21, 7], [4, 22, 3], [4, 23, 0], [5, 0, 2], [5, 1, 1], [5, 2, 0], [5, 3, 3], [5, 4, 0], [5, 5, 0], [5, 6, 0], [5, 7, 0], [5, 8, 2], [5, 9, 0], [5, 10, 4], [5, 11, 1], [5, 12, 5], [5, 13, 10], [5, 14, 5], [5, 15, 7], [5, 16, 11], [5, 17, 6], [5, 18, 0], [5, 19, 5], [5, 20, 3], [5, 21, 4], [5, 22, 2], [5, 23, 0], [6, 0, 1], [6, 1, 0], [6, 2, 0], [6, 3, 0], [6, 4, 0], [6, 5, 0], [6, 6, 0], [6, 7, 0], [6, 8, 0], [6, 9, 0], [6, 10, 1], [6, 11, 0], [6, 12, 2], [6, 13, 1], [6, 14, 3], [6, 15, 4], [6, 16, 0], [6, 17, 0], [6, 18, 0], [6, 19, 0], [6, 20, 1], [6, 21, 2], [6, 22, 2], [6, 23, 6]],
        // verbal_key_word: ['delete', 'select', '333', 'uuuuu'],
        // noun_key_word: ['bug', 'new', 'lllll', 'saaa'],
    },
    getters: {
        // getTime(state) {
        //     return state.time
        // },
        getRepoName(state){
            return state.repo_name
        },
        getRepoDescription(state){
            return state.repo_description
        },
        getRepo1Id(state) {
            return state.repo1_id
        },
        getRepo2Id(state) {
            return state.repo2_id
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
        getIssueNounKeyword(state) {
            return state.issue_noun_keyword
        },
        getIssueVerbKeyword(state) {
            return state.issue_verb_keyword
        },
        getReleaseX(state) {
            return state.releases_chart_x
        },
        getReleaseY(state) {
            return state.releases_chart_y
        },
        getCommitTime(state){
            return state.commit_time
        }
    },
    mutations: {
        // setTime(state, time) {
        //     state.time = time
        // },
        setRepoName(state, repo_name){
            state.repo_name = repo_name
        },
        setRepoDescription(state, repo_description){
            state.repo_description = repo_description
        },
        setRepo1Id(state, repo1_id) {
            state.repo1_id = repo1_id
        },
        setRepo2Id(state, repo2_id) {
            state.repo2_id = repo2_id
        },
        setRepo1Name(state, repo1_name) {
            state.repo1_name = repo1_name
        },
        setRepo2Name(state, repo2_name) {
            state.repo2_name = repo2_name
        },
        setDevelopers(state, developer_num) {
            state.developer_num = developer_num
        },
        setOpenIssues(state, open_issue_num) {
            state.open_issue_num = open_issue_num
        },
        setCloseIssues(state, closed_issue_num) {
            state.closed_issue_num = closed_issue_num
        },
        setIssueAvg(state, issue_avg) {
            state.issue_avg = issue_avg
        },
        setReleases(state, release_num) {
            state.release_num = release_num
        },
        setIssueBox(state, issue_box) {
            state.issue_box = issue_box
        },
        setIssueVariance(state, issue_variance) {
            state.issue_variance = issue_variance
        },
        setIssueTop10Name(state, issue_top10_name) {
            state.issue_top10_name = issue_top10_name
        },
        setIssueTop10Duration(state, issue_top10_duration) {
            state.issue_top10_duration = issue_top10_duration
        },
        setDeveloperChartY(state, developer_chart_y) {
            state.developer_chart_y = developer_chart_y
        },
        setDeveloperChartX(state, developer_chart_x) {
            state.developer_chart_x = developer_chart_x
        },
        setIssueScatter(state, issue_scatter) {
            state.issue_scatter = issue_scatter
        },
        setIssueNounKeyword(state, issue_noun_keyword) {
            state.issue_noun_keyword = issue_noun_keyword
        },
        setIssueVerbKeyword(state, issue_verb_keyword) {
            state.issue_verb_keyword = issue_verb_keyword
        },
        setReleaseX(state, releases_chart_x) {
            state.releases_chart_x = releases_chart_x
        },
        setReleaseY(state, releases_chart_y) {
            state.releases_chart_y = releases_chart_y
        },
        setCommitTime(state, commit_time){
            state.commit_time = commit_time
        }

    },
    actions: {
        repoInit({commit}){
            request.get('http://127.0.0.1:8085/api/repo/list').then(res=>{
                console.log(res)
                commit('setRepo1Name', res.data[0].name)
                commit('setRepo2Name', res.data[1].name)
                commit('setRepo1Id', res.data[0].id)
                commit('setRepo2Id', res.data[1].id)
            })
        },
        developer({commit}, id){
            request.get('http://127.0.0.1:8085/api/repo/get_developer_count', {
                params: {
                    id: id
                }
            }).then(res=>{
                console.log(res)
                commit('setDevelopers', res.data)
            })
        },
        open_issue({commit}, id){
            request.get('http://127.0.0.1:8085/api/repo/get_open_issue_cnt', {
                params: {
                    id: id
                }
            }).then(res=>{
                console.log(res)
                commit('setOpenIssues', res.data)
            })
        },
        closed_issue({commit}, id){
            request.get('http://127.0.0.1:8085/api/repo/get_closed_issue_cnt', {
                params: {
                    id: id
                }
            }).then(res=>{
                console.log(res)
                commit('setCloseIssues', res.data)
            })
        },
        release({commit}, id){
            request.get('http://127.0.0.1:8085/api/repo/get_release_cnt', {
                params: {
                    id: id
                }
            }).then(res=>{
                console.log(res)
                commit('setReleases', res.data)
            })
        },
        repoNameDes({commit}, id){
            request.get('http://127.0.0.1:8085/api/repo/list').then(res=>{
                console.log(res)
                res.data.filter(a => a.id === id).forEach(
                    b => {
                        commit('setRepoName', b.name)
                        commit('setRepoDescription', b.description)
                    }
                )
            })
        }

    },
    modules: {}
})
