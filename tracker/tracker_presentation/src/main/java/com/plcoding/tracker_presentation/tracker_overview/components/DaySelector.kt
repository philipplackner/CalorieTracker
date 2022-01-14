package com.plcoding.tracker_presentation.tracker_overview.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.plcoding.tracker_presentation.R
import java.time.LocalDate

@Composable
fun DaySelector(
    date: LocalDate,
    onPreviousDayClick: () -> Unit,
    onNextDayClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(onClick = onPreviousDayClick) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = stringResource(id = R.string.previous_day)
            )
        }
        Text(
            text = parseDateText(date = date),
            style = MaterialTheme.typography.h2
        )
        IconButton(onClick = onNextDayClick) {
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = stringResource(id = R.string.next_day)
            )
        }
    }
}