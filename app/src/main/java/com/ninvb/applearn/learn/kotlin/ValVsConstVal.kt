package com.ninvb.applearn.learn.kotlin

/**
 * val: - khong can phai la 1 gia tri co dinh duoc dinh nghia san
 *      - co the dinh nghia trong compile time
 *      - compiler khong dua gia tri cua val vao inline code trong qua trinh bien dich
 *
 * const val:
 *      - gia tri co dinh san trong code
 *      - compiler se dua gia tri nay vao trong inline code trong qua trinh bien dich.
 *      Neu khong tim thay compiler se bao loi
 * ==> const val khong the dung voi kieu du lieu object vi compiler khong the xac dinh duoc gia tri
 *      cua no trong compile time
 */
class ValVsConstVal {
}